using System;
using Newtonsoft.Json;

class Program {
    static void Main() {
        Console.WriteLine("Hello, .NET!");
        var json = JsonConvert.SerializeObject(new { message = "Hello" });
        Console.WriteLine($"JSON: {json}");
    }
}