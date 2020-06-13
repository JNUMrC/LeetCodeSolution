package easy;

/**
 * 204. Count Primes
 * Easy
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * @author mrc
 * Date: 2020/4/25 0025
 * Time: 12:46
 */
public class S204_CountPrimes
{
    public static void main(String[] args)
    {
        System.out.println(new S204_CountPrimes().countPrimes(5));
        System.out.println(new S204_CountPrimes().countPrimes(10));
        System.out.println(new S204_CountPrimes().countPrimes(30));
    }
    public int countPrimes(int n) {
        if(n < 2) return 0;
        boolean[] notPrimes = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if(!notPrimes[i])
            {
                for (int j = 2; i * j < n; j++)
                {
                    notPrimes[i * j] = true;
                }
            }
        }
        int c = 0;
        for (int i = 2; i < notPrimes.length; i++)
        {
            if(!notPrimes[i]) c++;
        }
        return c;
    }
}
