
public class Increment {
	public static void main(String[] args) {
		int i=10;//10
		System.out.println(i++);//10 11
		System.out.println(--i);//10 10
		--i;//9
		i--;//8
		System.out.println(i);//8
		System.out.println(++i);//9 9
		System.out.println(i--);//9 8
		System.out.println(i);//8
		i++;//9
		i = i++ + ++i;//20
		System.out.println(i);//20
		i = i++ + i++ + i++;
		System.out.println(i);//43
	}
}
