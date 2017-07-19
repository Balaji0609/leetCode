package leetCode;
public class function {

	static String[] Correlation(int N)
	{
		String[] scores = {"20","10","21"};
		int class_size = Integer.parseInt(scores[0]);
		int n = 0;
		String arr[] ;
		int maths = 0, physics = 0, chemistry = 0;
		long mathsSum = 0, physicsSum = 0, chemistrySum = 0, M_M_Sum = 0, P_P_Sum = 0, C_C_Sum = 0, M_P_Sum = 0, P_C_Sum = 0, M_C_Sum = 0;
		while(n < class_size)
		{
			arr = scores[n].split(" ");
			
			maths = Integer.parseInt(arr[0]);
			physics = Integer.parseInt(arr[1]);
			chemistry = Integer.parseInt(arr[2]);
			mathsSum += maths;
			physicsSum += physics;
			chemistrySum += chemistry;
			M_M_Sum += (maths * maths);
			C_C_Sum += (chemistry * chemistry);
			P_P_Sum += (physics * physics);
			M_P_Sum += (maths * physics);
			P_C_Sum += (physics * chemistry);
			M_C_Sum += (maths * chemistry);
			n++;
		}
		double Corr_MP = (double)((class_size * M_P_Sum) - (mathsSum * physicsSum)) / ((Math.sqrt((double)(class_size * M_M_Sum) - (mathsSum * mathsSum))) * (Math.sqrt((double)(class_size * P_P_Sum) - (physicsSum * physicsSum))));
		double Corr_PC = (double)((class_size * P_C_Sum) - (physicsSum * chemistrySum)) / ((Math.sqrt((double)(class_size * P_P_Sum) - (physicsSum * physicsSum))) * (Math.sqrt((double)(class_size * C_C_Sum) - (chemistrySum * chemistrySum))));
		double Corr_MC = (double)((class_size * M_C_Sum) - (mathsSum * chemistrySum)) / ((Math.sqrt((double)(class_size * M_M_Sum) - (mathsSum * mathsSum))) * (Math.sqrt((double)(class_size * C_C_Sum) - (chemistrySum * chemistrySum))));
		String returnstr[] = {Double.toString(Corr_MP),Double.toString(Corr_PC), Double.toString(Corr_MC)}; 
		return returnstr;
	}
	
	
}
