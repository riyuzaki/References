import java.util.Scanner;
class xyz
{

  int parent(int i)
   {
      int n;
      n=(i-1)/2;
     return n;

   }
 int left(int i, int a[])
  {

    return 2*i+1;

  }

   int right(int i,int a[])
   {
     int n,k;
     n=a.length;

     return (2*i)+2;

   }

    void minheapfy(int a[],int j,int heapsize)
     {
       int l,r,p,smallest,temp;


       l=left(j,a);
       r=right(j,a);



       if (l<(heapsize) && a[j]<a[l])
          {
           smallest=l;
          }
      else
          {
            smallest=j;
          }

        if (r<(heapsize) && a[smallest]<a[r])
         {
         smallest=r;
         }
        if(smallest != j)
          {
           temp=a[smallest];
           a[smallest]=a[j];
           a[j]=temp;
           minheapfy(a,smallest,heapsize);
          }
        }


   void minheap(int a[],int n)
      {
        int i,z,k;
        z=(a.length-1);
        n=((a.length-2)/2);
        for(i=n;i>=0;i--)
           {
             minheapfy(a,i,z);

            }
        }


   void heapsort(int a[],int n)
     {
       int i,g,temp,k;
       n=a.length;
       g=a.length;
       minheap(a,n);
       /*for(k=0;k<=a.length;k++)
       {
       System.out.println(a[k]);
     }*/

       for(i=n-1;i>=1;i--)
       {

         temp = a[i];
         a[i]=a[0];
         a[0]=temp;

         g=g-1;


         minheapfy(a,0,g);

       }
     }



  int minextract(int a[],int n)
       {
         heapsort(a,a.length);
         int min;
         n=a.length;
         min=a[0];
         a[0]=a[n-1];
         n=n-1;
         minheapfy(a,0,n);
         return min;
       }


void heapdecreasekey(int a[],int j,int key)
{
  int temp;
  a[j]=key;
  while(j>0 && a[parent(j)]>a[j])
       {
         temp=a[parent(j)];
         a[parent(j)]=a[j];
         a[j]=temp;
         j=parent(j);

       }

}


void minheapinsert(int a[],int key)
{
  a[a.length]=Integer.MAX_VALUE;
  heapdecreasekey(a,a.length,key);

}










}









class abc
{
  public static void main(String args[])
  {
    int size,x,y;
    int[] p={1,25,3,41,5};




    xyz s1 = new xyz();
    //s1.heapsort(p,p.length);
    //for(x=0;x<p.length;x++)
    //System.out.println(p[x])
    y=s1.minextract(p,p.length);
    System.out.println(y);
    y=s1.minextract(p,p.length);
    System.out.println(y);
    y=s1.minextract(p,p.length);
    System.out.println(y);
    y=s1.minextract(p,p.length);
    System.out.println(y);
    y=s1.minextract(p,p.length);
    System.out.println(y);










  }

}
