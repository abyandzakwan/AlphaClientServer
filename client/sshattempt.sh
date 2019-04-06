#!/bin/bash

cat /var/log/auth.log | grep "Successful" > ssh-success.txt
export lines="ssh-success.txt"
num_lines1=$(wc -l "$lines"| awk '{print $1}')

cat /var/log/auth.log | grep "error" > ssh-failed1.txt
export baris="ssh-failed1.txt"
num_lines2=$(wc -l "$baris"| awk '{print $1}')

let totalines=num_lines1+num_lines2
echo "$totalines"

namahost=$(hostname)
echo "$namahost"

javac client.java
java client $totalines $namahost
