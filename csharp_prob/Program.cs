using System;

namespace csharp_prob
{
    class Program
    {
        static void Main(string[] args)
        {
            BigProblem aProblem = new BigProblem();
            aProblem._name = "Chris";
            Console.WriteLine("Hello World!" + aProblem._name);
        }
    }
    class BigProblem 
    {
        
         public string _name;

        
    }
}
