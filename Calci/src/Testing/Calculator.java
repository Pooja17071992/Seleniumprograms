package Testing;

import org.testng.annotations.Test;

public class Calculator {
int a=100;
int b=200;

@Test
public void sum()
{
	System.out.println(a+b);
}
@Test
public void mul()
{
	System.out.println(a*b);
}
};

