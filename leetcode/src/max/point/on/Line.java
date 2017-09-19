package max.point.on;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;
/*
 * 采用求斜率用double类型存储，很有可能会溢出，超出double的表示范围，所以采用最简分数的表示形式
 */
class Point {
     int x;
     int y;
     Point() { x = 0; y = 0; }
     Point(int a, int b) { x = a; y = b; }
}
public class Line {
	public static void main(String[] args) {
		//[[-4,-4],[-8,-582],[-3,3],[-9,-651],[9,591]]
		Point[] array = { new Point(-4,-4), new Point(-8,-582), new Point(-3,-3), new Point(-9,-651), new Point(9,591)}; 
		//[[0,0],[94911151,94911150],[94911152,94911151]]
		//Point[] array = { new Point(84,250), new Point(0,0) , new Point(1,0), new Point(0,-70), new Point(0,-70), new Point(1,-1), new Point(21,10), new Point(42,90),new Point(-42,-230)};  
		//Point[] array = { new Point(0,0), new Point(94911151,94911150),new Point(94911152,94911151)};  
		//Point[] array = { new Point(0,0), new Point(1,0)};  
		//Point[] array = { new Point(1,1), new Point(1,2), new Point(1,3),new Point(2,1)};  
		 //Point[] array = { new Point(1,1), new Point(1,1), new Point(1,1)};  
		//Point[] array = { new Point(2,3), new Point(3,3),new Point(-5,3)};  
		//Point[] array = {new Point(40,-23),new Point(9,138),new Point(429,115),new Point(50,-17),new Point(-3,80),new Point(-10,33),new Point(5,-21),new Point(-3,80),new Point(-6,-65),new Point(-18,26),new Point(-6,-65),new Point(5,72),new Point(0,77),new Point(-9,86),new Point(10,-2),new Point(-8,85),new Point(21,130),new Point(18,-6),new Point(-18,26),new Point(-1,-15),new Point(10,-2),new Point(8,69),new Point(-4,63),new Point(0,3),new Point(-4,40),new Point(-7,84),new Point(-8,7),new Point(30,154),new Point(16,-5),new Point(6,90),new Point(18,-6),new Point(5,77),new Point(-4,77),new Point(7,-13),new Point(-1,-45),new Point(16,-5),new Point(-9,86),new Point(-16,11),new Point(-7,84),new Point(1,76),new Point(3,77),new Point(10,67),new Point(1,-37),new Point(-10,-81),new Point(4,-11),new Point(-20,13),new Point(-10,77),new Point(6,-17),new Point(-27,2),new Point(-10,-81),new Point(10,-1),new Point(-9,1),new Point(-8,43),new Point(2,2),new Point(2,-21),new Point(3,82),new Point(8,-1),new Point(10,-1),new Point(-9,1),new Point(-12,42),new Point(16,-5),new Point(-5,-61),new Point(20,-7),new Point(9,-35),new Point(10,6),new Point(12,106),new Point(5,-21),new Point(-5,82),new Point(6,71),new Point(-15,34),new Point(-10,87),new Point(-14,-12),new Point(12,106),new Point(-5,82),new Point(-46,-45),new Point(-4,63),new Point(16,-5),new Point(4,1),new Point(-3,-53),new Point(0,-17),new Point(9,98),new Point(-18,26),new Point(-9,86),new Point(2,77),new Point(-2,-49),new Point(1,76),new Point(-3,-38),new Point(-8,7),new Point(-17,-37),new Point(5,72),new Point(10,-37),new Point(-4,-57),new Point(-3,-53),new Point(3,74),new Point(-3,-11),new Point(-8,7),new Point(1,88),new Point(-12,42),new Point(1,-37),new Point(2,77),new Point(-6,77),new Point(5,72),new Point(-4,-57),new Point(-18,-33),new Point(-12,42),new Point(-9,86),new Point(2,77),new Point(-8,77),new Point(-3,77),new Point(9,-42),new Point(16,41),new Point(-29,-37),new Point(0,-41),new Point(-21,18),new Point(-27,-34),new Point(0,77),new Point(3,74),new Point(-7,-69),new Point(-21,18),new Point(27,146),new Point(-20,13),new Point(21,130),new Point(-6,-65),new Point(14,-4),new Point(0,3),new Point(9,-5),new Point(6,-29),new Point(-2,73),new Point(-1,-15),new Point(1,76),new Point(-4,77),new Point(6,-29)};  
		
		System.out.println(maxPoints(array));
		//最后一个测试用例是leetCode上面最难AC的一个数据，正确答案应该是25，小伙伴们AC了吗？ 
	}
    public static int maxPoints(Point[] points) {
    	if(points.length<3)
    		return points.length;
    	int max=0;//记录同一直线最多的点的个数
    	//从第一个点依次和其它的点都进行建立直线，计算斜率，这个点作为固定点
    	for(int i=0;i<points.length;i++){
    		//键为斜率，值个该斜率有几个点
    		Map<Double, Integer> map=new HashMap<Double, Integer>();
    		//遍历其他点，计算斜率
    		int duplicate = 1;//记录跟固定点重复的数据  ,默认自己一个
    		for(int j=0;j<points.length;j++){
    			
    			double slope = 0.0; //斜率
    			
    			if(i==j){//访问到自己
    				continue;//直接跳过该次循环
    			}else if ((points[i].x==points[j].x)&&(points[i].y==points[j].y)) {
    				//如果是重复点，单独记录
    				duplicate++;
    				continue;  
    			}else if (points[i].x==points[j].x) {//如果是在同一条垂直直线上
    				slope=Integer.MAX_VALUE;		
				}else {
					
					//这里要特别注意，斜率是个double值，但是两个int值得除法必定是int类型，这里需要强转流类型
					slope=(double)(points[j].y-points[i].y)/(points[j].x-points[i].x);
					System.out.println(slope);
				}
    		    //将数据插入到map集合中
//    			map.put(slope, map.containsKey(slope)?map.get(slope)+1:1);
    		    map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1);  
    		}
    		//更新max数据
    		//System.out.println(duplicate);
    		if (map.keySet().size() == 0) {//如果map为空  ,必须考虑，集合为空，要不然无法遍历集合，而接下来的运算无法继续
                max = duplicate > max ? duplicate : max;  
            } else {  
                for (double key : map.keySet()) {  
                    max = Math.max((duplicate + map.get(key)), max);   
                }  
            }  
    		
    	}
        return max;
    }

}
