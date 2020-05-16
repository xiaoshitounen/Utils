package swu.xl.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveToAlbumUtil {
    /**
     * 将一个bitmap保存到系统相册中
     * @param bitmap
     * @param picName
     * @param context
     */
    public static void saveBitmapToGallery(Bitmap bitmap, String picName, Context context) {

        String fileName = null;
        //系统相册目录
        String galleryPath= Environment.getExternalStorageDirectory()
                + File.separator + Environment.DIRECTORY_DCIM
                +File.separator+"Camera"+File.separator;

        // 声明文件对象
        File file = null;
        // 声明输出流
        FileOutputStream outStream = null;

        try {
            // 如果有目标文件，直接获得文件对象，否则创建一个以filename为名称的文件
            file = new File(galleryPath, picName+ ".jpeg");

            // 获得文件相对路径
            fileName = file.toString();
            // 获得输出流，如果文件中有内容，追加内容
            outStream = new FileOutputStream(fileName);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outStream);

        } catch (Exception e) {
            e.getStackTrace();
        }finally {
            //释放资源
            try {
                if (outStream != null) {
                    outStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //将图片插入到系统相册中
        MediaStore.Images.Media.insertImage(context.getContentResolver(),
                bitmap, fileName, null);

        //通知相册更新
        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        Uri uri = Uri.fromFile(file);
        intent.setData(uri);
        context.sendBroadcast(intent);

        //信息提示
        Toast.makeText(context, "图片保存成功", Toast.LENGTH_SHORT).show();
    }
}
