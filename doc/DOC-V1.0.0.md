# DOC V1.0.0

## 日期时间工具类(DateTimeUtils)

`differDays(Intsant, Intsant)`：两个时间点相差天数

`differHours(Intsant, Intsant)`：两个时间点相差小时数

`differMinutes(Intsant, Intsant)`：两个时间点相差分钟数

`differSeconds(Intsant, Intsant)`：两个时间点相差秒数

`differMillis(Intsant, Intsant)`：两个时间点相差毫秒数

#### 控制台打印工具类(PrintUtils)

`(Boolean) DEBUG`：控制是否打印，默认true，打印

`info(Object)`：打印对象

`info()`：换行

#### ID生成工具类(IdUtils)

`getIdByUUID()`：通过UUID生成Id，无`-`

`getUUID()`：UUID，有`-`

#### AES加密/解密工具类(AESUtils)

`String encrypt(String content, String password)`：加密方法，参数为加密内容和密码，返回类型：String

`String decrypt(String content, String password)`：解密方法，参数为解密内容和密码，返回类型：String
