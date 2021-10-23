use std::io;

pub(crate) fn crne() {

    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Couldn't read line");

    let mut cuts = buffer.trim().parse::<i64>().unwrap();

    let mut value = 0;
    if cuts % 2 == 0 {
        value = ((cuts/2)+1).pow(2);
    }else{
        value = ((cuts/2)+1) * ((cuts/2)+2);
    }
    println!("{}", value );
}


/*
0 1 = 1 * 1
1 2 = 1 * 2
2 4 = 2 * 2
3 6 = 2 * 3
4 9 = 3 * 3
5 12 = 3 * 4
6 16 = 4 * 4
7 20 = 4 * 5
8 25 = 5 * 5
9 30 = 5 * 6
10 36 = 6 * 6
 */