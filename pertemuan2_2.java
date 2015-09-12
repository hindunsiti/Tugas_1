public class pertemuan2_2{
public static void main(String[] args){
String hari;
int bilangan1=Integer.parseInt(args[0]);
switch(bilangan1){
case 0 :
hari="senin";
break;
case 1 :
hari="selasa";
break;
case 2 :
hari="rabu";
break;
case 3 :
hari="kamis";
break;
case 4 :
hari="jumat";
break;
case 5 :
hari="sabtu";
break;
case 6 :
hari="minggu";
default :
hari="Tidak ada";
break;
}
System.out.println("ini hari      = " + hari);

}
}