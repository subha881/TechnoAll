����   @ 8
      java/lang/Object <init> ()V	  	 
   PrintJob printer 	LPrinter;	     message Ljava/lang/String;
      Printer print (Ljava/lang/String;)V
    Resume print by T1 thread
     (LPrinter;Ljava/lang/String;)V  java/lang/Thread   T1
  "  # )(Ljava/lang/Runnable;Ljava/lang/String;)V
  % &  start ( Resume print by T2 thread * T2 , Resume print by T3 thread . T3 0 java/lang/Runnable Code LineNumberTable run main ([Ljava/lang/String;)V 
SourceFile PrintJob.java !    /                   1   3     *� *+� *,� �    2          	   	  3   1   (     *� *� � �    2   
       	 4 5  1   �     _� Y� L� Y+� M� Y,� !N-� $� Y+'� :� Y)� !:� $� Y++� :� Y-� !:� $�    2   .           "  .  ;  @   L " Y # ^ $  6    7