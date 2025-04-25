package main

import (
    "encoding/json"
    "fmt"
    "log"
    "net/http"
    "time"

    "github.com/gorilla/mux"
)

// Middleware for logging requests
func loggingMiddleware(next http.Handler) http.Handler {
    return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
        start := time.Now()
        log.Printf("%s %s %s", r.Method, r.RequestURI, r.RemoteAddr)
        next.ServeHTTP(w, r)
        log.Printf("Completed in %v", time.Since(start))
    })
}

// Middleware for basic authentication
func authMiddleware(next http.Handler) http.Handler {
    return http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {
        user, pass, ok := r.BasicAuth()
        if !ok || user != "admin" || pass != "password" {
            http.Error(w, "Unauthorized", http.StatusUnauthorized)
            return
        }
        next.ServeHTTP(w, r)
    })
}

// Handler for the home route
func homeHandler(w http.ResponseWriter, r *http.Request) {
    response := map[string]string{"message": "Welcome to the Home Page!"}
    jsonResponse(w, response, http.StatusOK)
}

// Handler for the about route
func aboutHandler(w http.ResponseWriter, r *http.Request) {
    response := map[string]string{"message": "This is the About Page."}
    jsonResponse(w, response, http.StatusOK)
}

// Utility function to send JSON responses
func jsonResponse(w http.ResponseWriter, data interface{}, status int) {
    w.Header().Set("Content-Type", "application/json")
    w.WriteHeader(status)
    json.NewEncoder(w).Encode(data)
}

// Struct and Interface Example
// Defining an interface
interface Animal {
    Speak() string
}

// Structs implementing the interface
type Dog struct {}
func (d Dog) Speak() string {
    return "Woof!"
}

type Cat struct {}
func (c Cat) Speak() string {
    return "Meow!"
}

// Function to demonstrate polymorphism
func makeAnimalSpeak(a Animal) {
    fmt.Println(a.Speak())
}

// Goroutines and Channels Example
func printNumbers(ch chan int) {
    for i := 0; i < 5; i++ {
        ch <- i
    }
    close(ch)
}

func main() {
    fmt.Println("Starting server on :8080")

    r := mux.NewRouter()

    // Adding routes
    r.HandleFunc("/", homeHandler).Methods("GET")
    r.HandleFunc("/about", aboutHandler).Methods("GET")

    // Applying middleware
    r.Use(loggingMiddleware)
    r.Use(authMiddleware)

    // Starting the server
    log.Fatal(http.ListenAndServe(":8080", r))

    // Struct and Interface Example
    dog := Dog{}
    cat := Cat{}
    makeAnimalSpeak(dog)
    makeAnimalSpeak(cat)

    // Goroutines and Channels Example
    ch := make(chan int)
    go printNumbers(ch)
    for num := range ch {
        fmt.Println("Received number:", num)
    }
}