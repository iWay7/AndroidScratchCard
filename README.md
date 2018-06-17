# AndroidScratchCard
Android 刮刮卡视图。

### 本应用的示例

![image](https://github.com/iWay7/AndroidScratchCard/blob/master/sample.gif)   

### 本示例基于 AndroidHelpers 库，访问 https://github.com/iWay7/AndroidHelpers 添加依赖。

#### 开始使用：
##### 类似这样，在布局文件中声明一个内容层和一个同样大小的 ScratchCard 视图：
```
<ImageView
    android:id="@+id/contentView"
    android:layout_width="240dp"
    android:layout_height="150dp"
    android:layout_gravity="center"
    android:scaleType="centerCrop" />

<site.iway.androidhelpers.ScratchCard
    android:id="@+id/scratchCard"
    android:layout_width="240dp"
    android:layout_height="150dp"
    android:layout_gravity="center" />
```

##### 设置内容层及其回调：
```
mContentView = (ImageView) findViewById(R.id.contentView);
mContentView.setImageBitmap(AssetsHelper.readImageFile(this, "image.jpg"));
mScratchCard = (ScratchCard) findViewById(R.id.scratchCard);
mScratchCard.setOnScratchListener(new OnScratchListener() {
    @Override
    public void onScratch(ScratchCard scratchCard, float visiblePercent) {
        if (visiblePercent > 0.66) {
            Toast.makeText(MainActivity.this, "Content Visible", Toast.LENGTH_SHORT).show();
        }
    }
});
```

##### 其他可配置参数：
```
mScratchCard.setScratchDrawable(...); // 设置蒙版 Drawable
mScratchCard.setScratchWidth(...); // 设置擦除的宽度，以像素为单位
```
