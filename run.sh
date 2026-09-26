#!/usr/bin/env bash
# Compile a pattern folder into bin/ and run its Main class.
# Usage: ./run.sh behavioural/chainofresponsibility
set -e

if [ -z "$1" ]; then
    echo "Usage: ./run.sh <pattern-folder>   e.g. ./run.sh behavioural/state"
    exit 1
fi

dir="${1%/}"
cd "$(dirname "$0")"

javac -d bin "$dir"/*.java
java -cp bin "${dir//\//.}.Main"
