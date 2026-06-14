package Exercise1;
class Logger{
  private static Logger logger;

  private Logger(){

  }
  public static Logger getInstance(){
    if(logger == null){
      synchronized(Logger.class){
        if(logger == null){
          logger = new Logger();
        }
      }
    }
    return logger;
  }
  public void log(String message){
    System.out.println(message);
  }
}