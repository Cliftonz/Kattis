use std::io;

pub(crate) fn digitswap(){

    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Couldn't read line");

    let char_vec: Vec<char> = buffer.trim().chars().collect();

    println!("{1}{0}",char_vec[0],char_vec[1]);

}