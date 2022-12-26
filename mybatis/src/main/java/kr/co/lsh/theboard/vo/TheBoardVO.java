package kr.co.lsh.theboard.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class TheBoardVO {

	
	private long theBoardNum;
	@NonNull
    private String theBoardTitle;
	@NonNull
    private String irum;
	@NonNull
    private String theBoardPwd;
    private String theBoardContent;
    private String regiDate;
}
