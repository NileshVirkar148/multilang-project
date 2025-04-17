package main

import (
    "fmt"
    "github.com/gorilla/mux"
)

func main() {
    fmt.Println("Hello, Go!")
    r := mux.NewRouter()
    fmt.Println("Gorilla Mux initialized")
}