
pub(crate) fn hailstorm2(){
    let mut str: String = String::new();
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer)
                .ok()
                .expect("Couldn't read line");

    let mut init_value = buffer.trim().parse::<i64>().unwrap();
    let mut count = 0;
    loop {
        count = count +1;
        if init_value ==1 {
            break;
        }

        if init_value % 2 ==0 {
            init_value = init_value / 2;
        }else {
            init_value = 3 * init_value + 1;
        }
    }

    println!("{}",count);
}