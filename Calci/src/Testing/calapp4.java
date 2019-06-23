package Testing;

import org.testng.annotations.Test;

public class Calculator {
int a=100;
int b=200;

@Test
public void div()
{
	System.out.println(b/a);
}

};

