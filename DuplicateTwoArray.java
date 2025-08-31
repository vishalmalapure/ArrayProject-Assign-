class DuplicateTwoArray
{
public static void main(String sa[])
{
         int a1[]={10,20,30,40};
        int b1[]={20,30,50,10,10};
       int c[]=new int[a1.length+b1.length];
       int counter=0;
       int flag,i;
for( i=0;i<4;i++)
{
        flag=0;
        for(int j=0;j<5;j++)
         {
                        if(a1[i]==b1[j])
                         {
                                        flag=1;
                                        break;
                          }
            }

           if(flag==1)
                  {
                               flag=0;
                               for(int k=0;k<counter;k++)
                                {
                                                  if(a1[i]==c[k])
                                                   {
                                                       flag=1;
                                                       break;
                                                    }
                                }
                        if(flag==0)
                             {
                                      c[counter]=a1[i];
                                      counter++;
                              }
                 }
}
for( i=0;i<counter;i++)
      {
                System.out.println(c[i]); 
     }

}
}









