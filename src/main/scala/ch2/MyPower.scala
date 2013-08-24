package ch2


object MyPower {
  def power(x: Int, n: Int):Double  = {
      if (n==0) 1 else
        if (n<0) (1 / power(x,n * -1)) else
          if ((n % 2)==0) power(x,n/2) * power(x,n/2) else
          x*power(x,n-1)
    }
}
