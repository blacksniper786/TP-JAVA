class ExceptionNegatif extends Exception
{
	int valeur;

	ExceptionNegatif(int val)
	{
		valeur = val;
	}

	public String toString()
	{
		return valeur + " est  négatif";
	}
}
////////////////////////////////////////////////////
class ExceptionGrand extends Exception
{
	ExceptionGrand(String s)
	{
		super(s);
	}
}
/////////////////////////////////////////////////////////
class Factorielle2
{
	public static void main(String[] argv)
	{
	int i, n = 0,  factorielle = 1;

	try
		{
	n = Integer.parseInt(argv[0]);
	if (n < 0) throw (new ExceptionNegatif(n));
	for (i = 2; i <= n; i++) 
		{
		if (factorielle > Integer.MAX_VALUE / i) 
		throw (new ExceptionGrand
			(n + " est trop grand pour ce programme,\n"));
		factorielle *= i;
		}
	System.out.println("Voilà la factorielle des " + n + 
				" premiers entiers : " + factorielle);
		}
	catch (ArrayIndexOutOfBoundsException exc)
		{
	System.out.println("Indiquez l'entier dont on souhaite la factorielle  "
				+ "sur la ligne de commande");
		}
	catch(NumberFormatException exc)
		{
	System.out.println("L'argument doit être entier");
		}
	catch(ExceptionNegatif exc)
		{
	System.out.println(exc + " : la factorielle n'est pas définie");
		}
	catch(ExceptionGrand exc)
		{
	System.out.println(exc);
		}
	}
}


