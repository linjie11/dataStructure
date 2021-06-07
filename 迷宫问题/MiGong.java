public class MiGong{
	public static void main(String[] args){
		int[][] map = new int[8][7];
		for (int i=0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int j=1;j<7;j++){
			map[j][0] = 1;
			map[j][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		for (int i=0;i<8;i++){
			for (int j=0;j<7;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		setWay(map, 1, 1);
		for (int i=0;i<8;i++){
			for (int j=0;j<7;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	//使用递归回溯算法来给小球找路
	/**
	
	*/
	public static boolean setWay(int[][] map, int i, int j){
		if(map[6][5] == 2){
			return true;
		} else{
			if (map[i][j] == 0){         
				map[i][j] = 2;
				if(setWay(map, i+1, j)){    
					return true;
				}else if(setWay(map, i, j+1)){  
					return true;
				}else if(setWay(map, i-1, j)){   
					return true;
				}else if(setWay(map, i, j-1)){
					return true;
				}
				map[i][j]= 3;
				return false;
			}else{
				return false;
			}
		}
	}
}