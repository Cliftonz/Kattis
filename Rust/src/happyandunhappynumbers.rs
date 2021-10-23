
/*
For each test case once a number has been calculated to be happy or unhappy,
We then store the number in a hashtable that holds
 a true if happy and false if not happy.
On the next test, if the table does not have a value calculate it and store it.
 */

pub(crate) fn happy_and_unhappy_numbers() {
    let mut buffer = String::new();

    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Couldn't read line");

    let mut number_of_test_cases = buffer.trim().parse::<i32>().unwrap();

    let bitarr: [Option<bool>; 1000000] = [None;1000000];

    for i in 0..num_of_planets {
        buffer = "".to_string();
        io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Failed to read line");

        let inputs: Vec<i32> = buffer.split_whitespace()
            .map(|x| x.parse().unwrap())
            .collect();
    }
}