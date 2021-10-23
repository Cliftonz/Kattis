use std::io;

pub(crate) fn pot() {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Couldn't read line");

    let mut amount_of_numbers = buffer.trim().parse::<i64>().unwrap();

    let mut sum = 0;

    for i in 0..amount_of_numbers {
        buffer = "".to_string();
        io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Couldn't read line");

        let mut num = buffer.trim().parse::<i64>().unwrap();
        sum = sum + (num/10).pow((num % 10) as u32);
    }

    println!("{}",sum);
}