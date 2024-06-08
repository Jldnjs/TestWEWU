/*
 *	�ۼ���: ������
 *	�ۼ���: 2024-06-04 
 */
package life.wewu.web.domain.board;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bookmark {
	
	//�ʵ�
	private int bookmarkNo;			//pk �ϸ�ũ ��ȣ		//
	private int boardNo;
	private String nickName;
	
}
