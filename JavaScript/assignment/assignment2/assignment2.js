//funtion to find factorial of a number
        //1.using named function
        function factorial(n){
            var f = 1;
            while(n!==0){
            var r = n%10;
             f = f*n;
             n--;
            } 
            return f;
        }
        var fact = factorial(5)
        console.log('factorial = ',fact);
        console.log('-----------------------------------');

         //2.using function expression
         var factorial2 = function(n){
            var f = 1;
            while(n!==0){
            var r = n%10;
             f = f*n;
             n--;
            } 
            return f;
         }
         var fact2 = factorial2(5)
        console.log('factorial = ',fact2);
        console.log('-----------------------------------');

          //3.using self invoked function
          (function(n){
            var f = 1;
            while(n!==0){
            var r = n%10;
             f = f*n;
             n--;
            } 
            console.log('factorial = ',f);
         })(5);
         console.log('-----------------------------------');
         //4.using fat arrow function
         var factorial3 = n=>{
            var f = 1;
            while(n!==0){
            var r = n%10;
             f = f*n;
             n--;
            } 
            return f;
         }
         var fact3 = factorial3(5)
        console.log('factorial = ',fact3);
        console.log('-----------------------------------');

        //funtion to find fibonacci series
        //1.using named function
        function fibonacci(n){
            var f1=0,f2=1;
		while(n>0)
		{
			console.log('fibonacci series = ',f1)
			var f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
        }
        fibonacci(8);
        console.log('-----------------------------------');
        //2.using function expression
        var fibo = function(n){
            var f1=0,f2=1;
		while(n>0)
		{
			console.log('fibonacci series = ',f1)
			var f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
        }
        fibo(8);
        console.log('-----------------------------------');
         //3.using self invoked function
         (function(n){
            var f1=0,f2=1;
		while(n>0)
		{
			console.log('fibonacci series = ',f1)
			var f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
        }
    })(8);
    console.log('-----------------------------------');
     //4.using fat arrow function
     var fib = n=>{
        var f1=0,f2=1;
		while(n>0)
		{
			console.log('fibonacci series = ',f1)
			var f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
        }
     }
     fib(8);
     console.log('-----------------------------------');
     //funtion to find circumference of circle
     //1.using named function
      function circumference(r){
          var c = 2*3.14*r;
          console.log('circumference = ',c);
      }
      circumference(2.4);
      console.log('-----------------------------------');
        //2.using function expression
        var circumference2 = function(r){
            var c = 2*3.14*r;
          console.log('circumference = ',c);
        }
        circumference2(2.4);
        console.log('-----------------------------------');
         //3.using self invoked function
         (function(r){
            var c = 2*3.14*r;
          console.log('circumference = ',c);
        })(2.4);
        console.log('-----------------------------------');
     //4.using fat arrow function
     var circumference3 = r=>{
        var c = 2*3.14*r;
          console.log('circumference = ',c);
     }
     circumference3(2.4);
     console.log('-----------------------------------');

     //function to add number in an array and return total
      //1.using named function
      function add(a){
          var sum = 0;
          for(var i=0;i<a.length;i++)
          {
              sum = sum+a[i];
          }
          console.log('sum = ',sum);
      }
      var a = [1,4,6];
      add(a);
      console.log('-----------------------------------');

      //2.using function expression
      var sum = function(a){
        var sum = 0;
          for(var i=0;i<a.length;i++)
          {
              sum = sum+a[i];
          }
          console.log('sum = ',sum);
      }
      sum(a);

      console.log('-----------------------------------');
         //3.using self invoked function
         (function(a){
            var sum = 0;
          for(var i=0;i<a.length;i++)
          {
              sum = sum+a[i];
          }
          console.log('sum = ',sum);
        })(a);

        console.log('-----------------------------------');
     //4.using fat arrow function
     var sum2 = a=>{
        var sum = 0;
          for(var i=0;i<a.length;i++)
          {
              sum = sum+a[i];
          }
          console.log('sum = ',sum);
     }
     sum2(a);
     console.log('-----------------------------------');

     //funtion to find whether a is prime or not
     //1.using named function
     function isPrime(n){
        var i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
     }
     var p = isPrime(7);
     if(p){
         console.log('it is prime number');
     }
     else{
        console.log('it is not prime number');
     }
     console.log('-----------------------------------');

//2.using function expression
      var prime = function(n){
        var i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
      }
      var pr = prime(8);
      if(pr){
         console.log('it is prime number');
     }
     else{
        console.log('it is not prime number');
     }
     console.log('-----------------------------------');
     
         //3.using self invoked function
         (function(n){
            var i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return console.log('not prime number');
			i++;
		}
		return console.log('prime number');
      })(7);

      
      console.log('-----------------------------------');
     //4.using fat arrow function
     var prime2 = n=>{
        var i=2;
		while(i<=n/2)
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
     }
     var prm = prime(8);
      if(prm){
         console.log('it is prime number');
     }
     else{
        console.log('it is not prime number');
     }
