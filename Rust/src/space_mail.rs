use std::borrow::Borrow;
use std::io;

struct Planet {
    y: i32,
    x: i32,
    z: i32
}

impl Planet{
    fn default() -> Self {
        Planet{
            x: 0,
            y: 0,
            z: 0
        }
    }

    fn distance(&self, p: &Planet) -> f32{
        let x = ((self.x - &p.x).pow(2) +
            (self.y - &p.y).pow(2) +
            (self.z - &p.z).pow(2)) as f32;
        x.sqrt()
    }
}

pub(crate) fn space_mail() {
    let mut buffer = String::new();

    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Couldn't read line");

    let mut num_of_planets = buffer.trim().parse::<i32>().unwrap();

    let mut planets: Vec<Planet> = Vec::new();

    for i in 0..num_of_planets {
        buffer = "".to_string();
        io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Failed to read line");

        let inputs: Vec<i32> = buffer.split_whitespace()
            .map(|x| x.parse().unwrap())
            .collect();

        planets.push(Planet{
            x: inputs[0] as i32,
            y: inputs[1] as i32,
            z: inputs[2] as i32
        })
    }

    println!("{}",planets.len());

    println!("{}", planets[0].distance(planets[1].borrow()).ceil()  );

    for i in 0..planets.len()-1 {
        for j in i+1..planets.len() {
            println!("P{0} to P{1}: {2}",i,j,planets[i].distance(planets[j].borrow()).ceil())
        }
    }
}