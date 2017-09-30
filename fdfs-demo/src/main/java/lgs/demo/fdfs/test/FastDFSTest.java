package lgs.demo.fdfs.test;

import java.io.File;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;

import lgs.demo.fdfs.FastDFSClient;


/**
 * FastDFS测试 .
 * @author lgs
 *
 */
public class FastDFSTest {
	
	/**
	 * 上传测试.
	 * @throws Exception
	 */
	public static void upload() throws Exception {
		String filePath = "D:\\study/project/fdfs-demo/TestFile/上传文件测试.txt";
		File file = new File(filePath);
		String fileId = FastDFSClient.uploadFile(file, filePath);
		System.out.println("Upload local file " + filePath + " ok, fileid=" + fileId);
		// fileId:	group1/M00/00/00/wKiYglnKyw6AU8o0AAAAAAAAAAA733.txt
		// url:	http://192.168.152.130:8888/group1/M00/00/00/wKiYglnKyw6AU8o0AAAAAAAAAAA733.txt
	}
	
	/**
	 * 下载测试.
	 * @throws Exception
	 */
	public static void download() throws Exception {
		String fileId = "group1/M00/00/00/wKiYglnKy5WAGCE5AAAADCC3yYc463.txt";
		InputStream inputStream = FastDFSClient.downloadFile(fileId);
		File destFile = new File("D:\\\\study/project/fdfs-demo/TestFile/下载文件测试.txt");
		FileUtils.copyInputStreamToFile(inputStream, destFile);
	}

	/**
	 * 删除测试
	 * @throws Exception
	 */
	public static void delete() throws Exception {
		String fileId = "group1/M00/00/00/wKgEfVUYPieAd6a0AAP3btxj__E335.jpg";
		int result = FastDFSClient.deleteFile(fileId);
		System.out.println(result == 0 ? "删除成功" : "删除失败:" + result);
	}


	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		upload();
		//download();
//		delete();

	}

}
