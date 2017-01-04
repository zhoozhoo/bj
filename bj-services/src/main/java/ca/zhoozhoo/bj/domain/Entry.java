package ca.zhoozhoo.bj.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NonNull;

@Data
public class Entry {

	@Id
	public String id;

	@NonNull
	private LocalDateTime date;

	@NonNull
	private Character category;

	@NonNull
	private String text;

	private Character signifier;
}
