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
public class Donation {
	private int payNo;			//���� ��ȣ
	private String userName;	//������ �̸�
	private String email;		//������ �̸���
	private String phoneNum;	//������ ��ȭ��ȣ
	private String userBirth;	//������ �������
	private Date payDate;		//���� ��¥
	private String payFlag;		//���� �÷��� 	( ���� ���� : T / ���� ���� : F - default)
	private String payOption;		//���� ���� 	( īī������ / �佺���� )
	private String payType;		//���� ���ó	( �Ŀ� / ����Ʈ ����)
	private int payAmount;		//���� �ݾ�

}