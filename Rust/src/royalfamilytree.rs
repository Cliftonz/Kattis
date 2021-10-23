
/*
A tree should hold the following:
Name, Gender, parent, children: hashmap (no linear search), birth, successor number (added only after all people are loaded in
Children should be sorted by birthyear

keep a hash table of parents,

*/

use std::collections::HashMap;

struct Node {
    name: String,
    gender: char,
    parent: Option<Node>,
    male_children: IndexMap<Node>,
    female_children: IndexMap<Node>,
    birth_year: String,
    successor_number: i32
}

impl Node{
    //fn default() -> Self {}
    pub fn insert(&mut self, new_node: &Node, parent_list:Vec<String> ){



    }

    pub fn find_successor(&mut self, number:i32 ) -> &Node{

    }

    pub fn set_successor_number(&mut self){
        self.successor_number = 0;
        for child in self.children {

        }
    }

}

pub(crate) fn happy_and_unhappy_numbers() {
    let mut buffer = String::new();

    io::stdin().read_line(&mut buffer)
        .ok()
        .expect("Couldn't read line");

    let inputs: Vec<i32> = buffer.split_whitespace()
        .map(|x| x.parse().unwrap())
        .collect();

    let number_of_people = inputs[0];
    let number_of_queries = inputs[1];
    let queen_birth_year = inputs[2];

    // insert the queen to root
    let mut root = Node{
        name: "ELIZABETH_II",
        gender: 'F',
        parent: None,
        children: Vec::new(),
        birth_year: queen_birth_year,
        successor_number: 0
    };

    for i in 0..number_of_people {
        buffer = "".to_string();

        io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Failed to read line");

        let inputs: Vec<i32> = buffer.split_whitespace()
            .map(|x| x.parse().unwrap())
            .collect();

        root.insert(Node{
            name: inputs[0] ,
            gender: inputs[2],
            parent: None,
            children: Vec::new(),
            birth_year: inputs[3].parse::<i32>().unwrap() ,
            successor_number: 0
        },inputs[1])


    }

    // Process successors number in the tree

    // Query the tree
    for i in 0..number_of_queries {
        io::stdin().read_line(&mut buffer)
            .ok()
            .expect("Couldn't read line");

        let mut num = buffer.trim().parse::<i64>().unwrap();



    }

}