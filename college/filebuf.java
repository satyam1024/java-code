import java.io.*;
class Bu
{
public static void main(String args[])throws IOException
{
FileInputStream fis=new FileInputStream("tt.txt");
FileOutputStream fos=new FileOutputStream("t1.txt");
BufferedInputStream bis=new BufferedInputStream(fis);
BufferedOutputStream bos=new BufferedOutputStream(fos);

int t=0;
while((t=bis.read())!=-1)
{
bos.write((char)t);
}
bis.close();
bos.close();
fis.close();
fos.close();
}
} 
