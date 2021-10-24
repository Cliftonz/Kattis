
pub(crate) fn pet() {
    let mut str: String = String::new();
    let mut buffer = String::new();



        io::stdin().read_line(&mut buffer)
            .ok()
            .expect();

        let inputs: Vec<i32> = buffer.split_whitespace()
            .map(|x| x.parse::<i32>().unwrap()).sum()
            .collect();



}