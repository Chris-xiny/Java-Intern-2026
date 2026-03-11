Note 1:
    静态代码块只在第一次创建类对象时调用,很适合JDBC初始化连接时使用
        使用方法:类定义中:static{ 代码 } 即可

Note 2:
    异常:
        Throwable类包括Errow类(错误类，代码语法错误需大改动)与Exception类(异常类，小错误),
        Exception异常包括编译时期异常(Exception类以及子类,除了RuntimeExceptuon类)与运行时期异常(RuntimeException类及其子类)
    异常处理:(见demo_01)
        出现异常若无法处理虚拟机会将异常往上抛,即谁带调用出来的异常就抛给谁解决,
        若都无法解决直到main方法又抛回给jvm,jvm就会打印异常信息并退出程序,由此有两种解决方式:
                a.throws:在方法参数与方法体之间加上throws 异常(可多个,若多个异常有共同父类可直接throws 父异常),将异常往上抛让上面的去解决
                b.try{}catch{}:添加异常处理,可有多个catch捕获多个异常
    finally:
        放在try_catch后,finally{代码},finally里的代码最终都会执行,除了System.exit(0)

-------------------------------------------------
Daily:
    day1:多态
    day2:权限修饰符,代码块
    day3:异常处理,finally的使用