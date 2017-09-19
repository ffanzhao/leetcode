package max.point.on;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
//采用最简分数的表示形式、

public class Line2 {
	public static void main(String[] args) {
		//[[-4,-4],[-8,-582],[-3,3],[-9,-651],[9,591]]
		//[[0,0],[94911151,94911150],[94911152,94911151]]
		        Point[] array = { new Point(-4,-4), new Point(-8,-582), new Point(-3,-3), new Point(-9,-651), new Point(9,591)}; 
	//Point[] array = { new Point(84,250), new Point(0,0) , new Point(1,0), new Point(0,-70), new Point(0,-70), new Point(1,-1), new Point(21,10), new Point(42,90),new Point(-42,-230)};  
	//Point[] array = { new Point(0,0), new Point(94911151,94911150),new Point(94911152,94911151)};  
	//Point[] array = { new Point(0,0), new Point(1,0),new Point(0,1)};  
	//Point[] array = { new Point(1,1), new Point(1,2), new Point(1,3),new Point(2,1)};  
	 //Point[] array = { new Point(1,1), new Point(1,1), new Point(1,1)};  
	//Point[] array = { new Point(2,3), new Point(3,3),new Point(-5,3)};  
	//Point[] array = {new Point(40,-23),new Point(9,138),new Point(429,115),new Point(50,-17),new Point(-3,80),new Point(-10,33),new Point(5,-21),new Point(-3,80),new Point(-6,-65),new Point(-18,26),
    //new Point(-6,-65),new Point(5,72),new Point(0,77),new Point(-9,86),new Point(10,-2),new Point(-8,85),new Point(21,130),new Point(18,-6),new Point(-18,26),new Point(-1,-15),new Point(10,-2),new Point(8,69),
    //new Point(-4,63),new Point(0,3),new Point(-4,40),new Point(-7,84),new Point(-8,7),new Point(30,154),new Point(16,-5),new Point(6,90),new Point(18,-6),new Point(5,77),new Point(-4,77),new Point(7,-13),
    //new Point(-1,-45),new Point(16,-5),new Point(-9,86),new Point(-16,11),new Point(-7,84),new Point(1,76),new Point(3,77),new Point(10,67),new Point(1,-37),new Point(-10,-81),new Point(4,-11),new Point(-20,13),
    //new Point(-10,77),new Point(6,-17),new Point(-27,2),new Point(-10,-81),new Point(10,-1),new Point(-9,1),new Point(-8,43),new Point(2,2),new Point(2,-21),new Point(3,82),new Point(8,-1),new Point(10,-1),
    //new Point(-9,1),new Point(-12,42),new Point(16,-5),new Point(-5,-61),new Point(20,-7),new Point(9,-35),new Point(10,6),new Point(12,106),new Point(5,-21),new Point(-5,82),new Point(6,71),new Point(-15,34),
    //new Point(-10,87),new Point(-14,-12),new Point(12,106),new Point(-5,82),new Point(-46,-45),new Point(-4,63),new Point(16,-5),new Point(4,1),new Point(-3,-53),new Point(0,-17),new Point(9,98),new Point(-18,26),
    //new Point(-9,86),new Point(2,77),new Point(-2,-49),new Point(1,76),new Point(-3,-38),new Point(-8,7),new Point(-17,-37),new Point(5,72),new Point(10,-37),new Point(-4,-57),new Point(-3,-53),new Point(3,74),
    //new Point(-3,-11),new Point(-8,7),new Point(1,88),new Point(-12,42),new Point(1,-37),new Point(2,77),new Point(-6,77),new Point(5,72),new Point(-4,-57),new Point(-18,-33),new Point(-12,42),new Point(-9,86),
    //new Point(2,77),new Point(-8,77),new Point(-3,77),new Point(9,-42),new Point(16,41),new Point(-29,-37),new Point(0,-41),new Point(-21,18),new Point(-27,-34),new Point(0,77),new Point(3,74),new Point(-7,-69),
    //new Point(-21,18),new Point(27,146),new Point(-20,13),new Point(21,130),new Point(-6,-65),new Point(14,-4),new Point(0,3),new Point(9,-5),new Point(6,-29),new Point(-2,73),new Point(-1,-15),new Point(1,76),
    //new Point(-4,77),new Point(6,-29)};  
				
				System.out.println(maxPoints(array));
				//最后一个测试用例是leetCode上面最难AC的一个数据，正确答案应该是25，小伙伴们AC了吗？ 
				
				
	}
	public static int maxPoints(Point[] points){
		
		if(points.length<3){
			return points.length;
		}
		int max=0;//最大节点个数
		for(int i=0;i<points.length;i++){
			//依次把这个点，作为固定点，和其他点进行比较
			int duplicate = 1;//记录跟固定点重复的数据  ,默认自己一个,后面不做操作
			//在第一层遍历都需要重新建立一个双列集合
			Map<String, Integer> map=new HashMap<String, Integer>();
			for(int j=0;j<points.length;j++){
				if(i==j){
					continue;//如果再次访问到同一个节点，跳出本次循环
				}else if ((points[i].x==points[j].x)&&(points[i].y==points[j].y)) {
					duplicate++;
					continue;//如果重合，记录完就跳出本次循环
				}else  {
					//返回最简分数的字符串形式
					String key=getSlopeString(points[i], points[j]);
					
					//集合中是否包含该最简分数，如果是则加一，若不是则初始化一
					map.put(key, map.containsKey(key)?map.get(key)+1:1);	
					
				}
			}
			//在每次遍历的结束前，更新最大值
			if (map.keySet().size() == 0) {//如果map为空  ,必须考虑，集合为空，要不然无法遍历集合，而接下来的运算无法继续
                max = duplicate > max ? duplicate : max;  
            } else {  
                for (String key : map.keySet()) {  
                    if(map.get(key)+duplicate>max){
                    	max=map.get(key)+duplicate;//duplicate作为重合节点，每个键对应的值都应该加上它
                    } 
                }     
            }  
		}
		return max;
	}
	public static String getSlopeString(Point p1,Point p2){//获取最贱分数的字符串形式
		int x=p1.x-p2.x;
		int y=p1.y-p2.y;
		int gcd=getGcd(Math.abs(x),Math.abs(y));//这里求最大公约数，要求正以后再求
		String sign=getSign(x,y);
		
		return sign +Math.abs(x)/gcd + "/" + Math.abs(y)/gcd;
	}
	public static int getGcd(int m,int n){//获取最大公约数
		
		if(n>m){
			int temp=m;
			m=n;
			n=temp;
		}
		if(n==0){
			return m;
		}
		while(m%n!=0){
			int temp=m%n;
			m=n;
			n=temp;
		}
		return n;
	}
	public static String getSign(int a,int b){//获取最简分数的正负号
		if((a>0&&b>0)||(a<0&&b<0)){
			return "+";
			
		}else {
			return "-";
		}
	}

}
