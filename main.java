import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s="acbed";
		String t="acbdef";
		char chs[]=new char[s.length()];
		char cht[]=new char[t.length()];
		for(int i=0;i<chs.length;i++){
		    chs[i]=s.charAt(i);
		}
		for(int i=0;i<cht.length;i++){
		    cht[i]=t.charAt(i);
		}
		for(int i=0;i<chs.length;i++){
		    for(int j=i+1;j<chs.length;j++){
		        if(chs[i]>chs[j]){
		            char temp=chs[i];
		            chs[i]=chs[j];
		            chs[j]=temp;
		        }
		    }
		}
	    for(int i=0;i<cht.length;i++){
		    for(int j=i+1;j<cht.length;j++){
		        if(cht[i]>cht[j]){
		            char temp=cht[i];
		            cht[i]=cht[j];
		            cht[j]=temp;
		        }
		    }
		}
		String s1="";
		String t1="";
		for(int i=0;i<chs.length;i++){
		    s1=s1+chs[i];
		}
	    for(int i=0;i<cht.length;i++){
		    t1=t1+cht[i];
		}
		int i=0;
		int j=0;
		while(i<chs.length &&j<cht.length){
		    if(chs[i]==cht[j]){
		        i++;
		        j++;
		    }else{
		        System.out.print(cht[j]+" ");
		        j++;
		    }
		}
		while(j<cht.length){
		    System.out.print(cht[j]+" ");
		    j++;
		}
		}
	}

