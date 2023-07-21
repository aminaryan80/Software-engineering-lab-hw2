# Software-engineering-lab-hw2

## روش انجام آزمایش
ابتدا نیاز داریم یک کلاس Rectangle تعریف کنیم به طوری که فیلد‌های width و height و همچنین تابع computeArea را دارا باشد. برای این کار، چون از روش TDD پیروی می‌کنیم، تست‌های مورد نیاز برای این کلاس را می‌نویسیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/df1c8b7f-9dc3-423c-974a-b479b950ec0e)


در این تست، تابع computeArea را صدا می‌زنیم و width و height را به آن ورودی می‌دهیم و بررسی می‌کنیم که جواب تابع، مقدار درستی باشد. حال همانطور که مشاهده می‌شود، خطای کامپایل داریم و باید کلاس Rectangle را بنویسیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/35912afc-07d7-488f-b5ca-1b5b61e5a28f)

حال تست را اجرا می‌کنیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/5265f4fb-cf13-435c-a266-9912027bc273)

همانطور که مشخص است تست خطای زمان اجرا دارد. حال باید کد کلاس را طوری تغییر دهیم که تست پاس شود. بنابراین تابع computeArea را به این شکل تغییر می‌دهیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/72bae053-79f3-40c2-b821-7d48a1a6e923)

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/87140316-a1a0-40d3-b97c-378013013235)

و به این ترتیب تست هم پاس می‌شود.

حال باید برنامه را طوری تغییر دهیم تا امکان تغییر طول و عرض مستطیل وجود داشته باشد. ابتدا اقدام به نوشتن تست توابع setter می‌کنیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/dc477e7d-5228-4474-850f-31efaacb3d17)

حال کد مربوط به این بخش‌ها را می‌نویسیم به طوری که تست‌ها پاس شوند (فرایند انجام TDD مانند مثال اول است بنابراین از جزئیات پرهیز می‌کنیم):

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/491fd0da-477d-4c5c-b5ec-716ee16e59be)

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/2f93b4e2-6e0e-429b-90d9-00adb41f2f32)

حال نیاز به ساپورت مربع در کد خود داریم. همانطور که در کلاس هم مطرح شد، مربع یک مستطیل نیست و اگر باشد، قائده Liskov نقض می‌شود. چون اندازه height و width در مربع باید یکسان باشد و هنگام تغییر این فیلد‌ها، post-condition تابع قوی‌تر شده است. بنابراین یک interface به نام shape می‌نویسیم که در آن تابع computeArea تعریف شده است و هر دو کلاس Square و Rectangle از آن استفاده می‌کنیم. 

اما در هر صورت برای پیاده‌سازی، ابتدا تست‌های آن را می‌نویسیم:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/9d19ac66-1465-4a42-af8a-ae1cc03d6a29)

حال کدی می‌نویسیم که باعث پاس شدن تست‌ها شود:

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/b224916b-d671-4547-b493-d5da0c8e3096)

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/e22e05ee-8c22-402b-84af-161aaca6174f)

![image](https://github.com/aminaryan80/Software-engineering-lab-hw2/assets/59232424/5a77d9c6-0c29-44ae-acd5-54ac2fee9bf5)




حال درباره اصول SOLID در این کلاس صحبت می‌کنیم. واضح است که Single Responsibility در آن رعایت شده است چون تنها تابع کد فقط وظیفه محاسبه مساحت را دارد. همچنین OCP نیز رعایت شده است چون برای اضافه کردن فیچر‌های جدید به پروژه، نیاز به تغییر کد فعلی نداریم. همچنین برای به مشکل نخوردن در مورد اصل Liskov، از interface به نام Shape استفاده کردیم تا مشکلی پیش نیاید. همچنین مشکلی از بابت ISP نداریم چون هیچ کلاسی مجبور به استفاده از اینترفیسی که به توابع آن نیاز ندارد نیست. همچنین DIP نیز رعایت شده چون به abstraction وابسته‌ایم و می‌توانیم پیاده‌سازی تابع computeArea در کلاس را جداگانه تعیین کنیم.

## سوالات

1. 
