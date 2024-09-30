public class Thirtyth {

    //Here is problem where to solve BOOK Allocation Problem .in which allocate proper book pages as per given student count.
    //This is boolean function for checking the given pages are given mid and no one can more than middle
    public static boolean isPossible(int pages[],int n,int m,int mid)
    {
        int Student_count=1;
        int Total_sum_page=0;
        //this is checking
        for(int i=0;i<=n;i++)
        {
            if(Total_sum_page + pages[i] <=mid)
            {
                Total_sum_page+=pages[i];
            }
            //
            else
            {
                Student_count++;
                if(Student_count > m || pages[i] > mid)
                {
                    return false;
                }
                Total_sum_page=pages[i];
            }
        }
        return true;

    }
//This function will return MAXIMUM no of pages are to be reads from the students.
    public static int Book_alloC(int pages[],int n,int m)
    {
        int s=0;
        int sum=0;

        //for Calculating sum of pages
        for(int i=0;i<=n;i++)
        {
            sum+=pages[i];
        }
        int e=sum;
        int result=-1;
        //Logic Binary search
        int mid=s+(e-s)/2;
        while(s<=e)
        {
            if(isPossible(pages,n,m,mid))
            {
                result=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
            mid=s+(e-s)/2;

        }
        return result;
    }

    public static void main(String[] args) {
        int My_books[]={12,34,67,90};
        int student=2;
        System.out.println(" "+Book_alloC(My_books, My_books.length-1,student));

    }

}
//Step. // sum of total pages of book 12+34+67+90=>203,, Then find Mid using BINARY approach (203-0)/2=101
