# AsesListView
Sets of newly designed listviews with easy implementation...

It contains a sample app using a simple 2 text list view implemented in fews line for you..

[![](https://jitpack.io/v/Shwaubh/AsesListView.svg)](https://jitpack.io/#Shwaubh/AsesListView)





	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Shwaubh:AsesListView:v1.0'

	}


EaseView a;
a = (EaseView) findViewById(R.id.aa);
ArrayList upper = new ArrayList<>();
ArrayList lower = new ArrayList<>();

    for(int i = 0; i < 100 ; i++ )
    {
        upper.add("Upper " +i);
        lower.add("lower " +i);
    }
    a.init(this , upper , lower);
<second.test.aseslib.EaseView
android:layout_width="match_parent"
android:layout_height="match_parent"
android:id="@+id/aa"
android:background="@android:color/holo_green_dark"
/>


And you are done with your listview..

![a](https://user-images.githubusercontent.com/23352068/40516688-612cf2d4-5fcf-11e8-8d04-8100ca836ec8.JPG)
![b](https://user-images.githubusercontent.com/23352068/40516689-619fe820-5fcf-11e8-9483-813b09dedbbf.JPG)
