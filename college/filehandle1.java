import java.io.*;
class Ab
{
public static void main(String args[])throws IOException
{
FileOutputStream fos=new FileOutputStream("t1.txt");
String s="how not u??" ;
byte b[]=s.getBytes();

byte newarr[] = new byte[b.length + 1]; 

for (int i = 0; i < b.length; i++) 
    newarr[i] = b[i]; 


byte g = (byte)128;
newarr[b.length] = g; 
   
for(int i=0;i<newarr.length;i++){
    System.out.println(newarr[i]);
}
fos.write(newarr);
fos.close();
}
} 
