package chap_05;

public class page2continue {
	public static void main(String[] args) {
		
	//ġŲ �ֹ� �մ��߿� ��� �մ��� �մٰ� ����
	//For 
	int max = 20; //�ִ� ġŲ �Ǹ� ����
	int sold = 0; // ���� ġŲ �Ǹ� ����
	int noShow = 17;
	for (int i = 1 ; i<= 50 ; i++) {
		System.out.println(i + " �� �մ�, �ֹ��Ͻ� ġŲ ���Խ��ϴ�");
		
		if (i == noShow) {
			System.out.println(i+"��° �մ� , ���� ���� ���� �մԿ��� ��ȸ�� �Ѿ�ϴ�.");
			continue;
		}
		
		sold++; //�Ǹ�ó��
		if (sold == max) {
			System.out.println("���� ��ᰡ �����Ǿ����ϴ�");
			break;
		}
	}
	System.out.println("������ �����ϰڽ��ϴ�");
	
	System.out.println("---------------------------------");
	
	int index = 0;
	sold = 0;
		while(index <= 50) {
			index++;
			System.out.println(index + "�� �մ� �ֹ��Ͻ� ġŲ ���Խ��ϴ�" );
			
			if (index == noShow) {
				System.out.println(index + "���� ����̹Ƿ� ���� �մ� �ްڽ��ϴ�");
				continue;
			}
			sold++;
			if (sold == max) {
				System.out.println("���� ��ᰡ �����Ǿ����ϴ�");
				break;
			}
			}
				
			}
		
	}

