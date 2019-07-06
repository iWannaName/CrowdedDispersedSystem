package System.Tools.result;
import System.Tools.*;
public class Path {
	private point[] p;
	public Path(String json) {
		int num = 1;
		for(int i=0;i<json.length();i++) {
			if(json.charAt(i)==';') {
				num++;
			}
		}
		p = new point[num+1];
		for(int i=1;i<=num;i++) {
			int beg = 0;
			int end = json.indexOf(';');
			if(end!=-1){
				
			}
			else {
				beg=0;
				end = json.length();
				String pointjson = json.substring(beg,end);
				float x = Float.parseFloat(pointjson.substring(0, pointjson.indexOf(',')));
				float y = Float.parseFloat(pointjson.substring(pointjson.indexOf(',')+1, pointjson.length()));
				p[i]=new point(y,x);
				break;
			}
			String pointjson = json.substring(beg,end);
			float x = Float.parseFloat(pointjson.substring(0, pointjson.indexOf(',')));
			float y = Float.parseFloat(pointjson.substring(pointjson.indexOf(',')+1, pointjson.length()));
			p[i]=new point(x,y);
			if(settings.DEBUG_MODE) {
				System.out.print("[New Node]");
				System.out.println(p[i].toString());
			}
			json=json.substring(end+1,json.length());
		}

		if(settings.DEBUG_MODE) {
			for(int i=1;i<p.length;i++) {
				System.out.print("[Node]");
				System.out.println(p[i].toString());
			}
		}
	}
	public int pointNum() {
		return p.length;
	}

	public point[] getPoints() {
		if(settings.DEBUG_MODE) {
			System.out.print("[in the Path]");
			System.out.println(p[1].toString());
		}
		return p;
	}
}
