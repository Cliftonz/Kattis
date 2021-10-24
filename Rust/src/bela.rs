use std::collections::HashMap;
use std::io;

pub(crate) fn bela() {
    let mut buffer = String::new();

    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Can't read line");

    let inputs: Vec<String> = buffer.split_whitespace()
        .map(|x| x.parse().unwrap()).collect();

    let number_of_hands = inputs[0].parse().unwrap();
    let trumps = inputs[1].parse().unwrap();

    let mut trump_set: HashMap<char,i32> =  HashMap::new();

    trump_set.insert('A', 11);
    trump_set.insert('K',  4 );
    trump_set.insert('Q',  3 );
    trump_set.insert('J',  20);
    trump_set.insert('T',  10);
    trump_set.insert('9',  14);
    trump_set.insert('8',  0 );
    trump_set.insert('7',  0 );

    let mut non_set: HashMap<char,i32> =  HashMap::new();

    non_set.insert('A',  11);
    non_set.insert('K',  4 );
    non_set.insert('Q',  3 );
    non_set.insert('J',  2 );
    non_set.insert('T',  10);
    non_set.insert('9',  0 );
    non_set.insert('8',  0 );
    non_set.insert('7',  0 );


    let mut sum = 0;

    for _i in 0..number_of_hands {
        for _j in 0..4 {
            io::stdin().read_line(&mut buffer)
                .ok()
                .expect("Couldn't read line");

            let play: String = buffer.trim().parse::<String>().unwrap();

            if play.chars().nth(1).unwrap() == trumps {
                sum = sum + trump_set.get(&play.chars().nth(0).unwrap()).unwrap() ;
            }else {
                sum = sum + non_set.get(&play.chars().nth(0).unwrap()).unwrap();
            }
        }
    }

    println!("{}",sum)

}

