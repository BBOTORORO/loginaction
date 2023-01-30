package org.iclass.vo;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NewMember {
	private String id;
	private String name;
	private String password;
	private String email;
	private int age;
	private String gender;  
	private String hobbies;		//취미를 , 로 나열
	private LocalDateTime joinDate;
//	private Date joinDate2;				//년월일
	private Timestamp joinDate2;		//년월일 시분초
}

