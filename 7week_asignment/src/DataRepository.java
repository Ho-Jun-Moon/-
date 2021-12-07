public class DataRepository {

           private List<Object> data = new ArrayList<>();



           private static DataRepository instance = new DataRepository();



           public static DataRepository getInstance() {

                      return instance;

           }



           public void add(Object data) {

                      this.data.add(data);

           }



           public <T> List<T> getData(Class<T> templateClass) {

                      List<T> newData = new ArrayList<>();
                      for (Object i : data){
                        if (templateClass.isInstance(i)){
                            newData.add(i);
                        }
                      }



                      return newData;

           }

}