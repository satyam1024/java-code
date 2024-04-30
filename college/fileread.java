import java.io.*;
class R
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("tt.txt");
int t=0;
while((t=fis.read())!=-1)
{
System.out.print((char)t);
}

fis.close();
}
} 
