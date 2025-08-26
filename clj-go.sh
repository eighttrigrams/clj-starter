#!/bin/bash

git clone /home/daniel/Workspace/eighttrigrams/clj-starter $1
cd $1
rm -rf .git
git init
git add .
git commit -m "Start with \"clj-starter\""
clj -X:run
echo -e "\n"
cat README.md
echo -e "\n"

code --reuse-window .
