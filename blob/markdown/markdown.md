**Markdown Syntax**
===

> Markdown에 대하여 기본적인 내용 위주로 정리를 하였다.
> 여러 변형판이 존재하며(따라서 tool에 따라서 같은 markdown이 조금씩은 다르게 표시 되기도 한다.

**contents of table**
---
[TOC]

**Markdown Transform**
---
> 마크다운은 변형되어 사용되는 경우가 많다.  변형의 이유는 보통 기능의 추가, 혹은 더 편하게 사용하기 위함이다.  하지만 변형이 가능하다는 것은 동일한 문법이 tool에 따라 조금은 다르게 표시될 수 있다는 것을 의미한다.

* [Github-Flavored Markdown](https://help.github.com/categories/writing-on-github/)
	* 줄바꿈을 한번만 해도 강제개행을 할 수 있다.
	* do_this_and_do_that과 같은 형태의 단어를 기울임꼴 글자로 처리하지 않는다.
	* URL을 자동으로 링크로 변환해준다.
	* 코드를 입력할 때 ``` 로 감싸주는 문법이 추가되었다.
	* 문법 강조가 적용이 된다. Linguist를 이용하여 처리한다.
	* 작업 목록(Task lists) 문법이 추가되었다.
	* Git관련 링크를 자동으로 처리해준다. (SHA, 사용자, 이슈 등)

* [MultiMarkdown](http://fletcherpenney.net/multimarkdown/)
	* 기존 마크다운에 없는 기능(주석, 표 등)이 추가되어있다.

* [Haroopad Flavored Markdown](http://pad.haroopress.com/page.html)
	* 강조 문법이 추가되었다. 사용 방법은 == 강조 == 처럼 쓰면 된다. 어디서 본 것 같은데
	* 목차 기능이 추가되었다. 사용 방법은 [TOC]처럼 쓰면 된다.
	* @[](http://www.youtube.com/watch?v=jo_B4LTHi3I) 처럼 유튜브 영상 등을 추가할 수 있다.
	* 다이어그램 기능이 추가되었다.

> 개인적으로 stackedit이라는 web기반 editor을 사용하고 있는데 대다수 변형 마크다운을 지원한다.  그래서 위에서 사용하는 분법을 ~~모두? 거의 모두?~~ 사용 가능하다.

**Block Elements**
---

### **Headers**
> 문맥의 head를 표시할때 사용.  실질적으로는 글자 크기만 변한다.
> H1 ~ H6 까지만 사용가능

#### **basic syntax**
	# H1
	## H2
	### H3
	#### H4
	##### H5
	###### H6

#### **expanded syntax**
	
	1) #와 ===
		"# H1 Title"은 
		"H1 title
	     ========" 와 같은 형태로도 사용 가능

    2) ##와 ---
		"## H2 Title" 은 
		"H2 Title
		 -------- " 와 같은 형태로도 사용 가능
	
	3) ===와 ---의 숫자
		"==="와 "---"은 3글자 이상이면 동일
	    예를 들어 "===" 와 "========"은 동일

	4) optional end fix
		"# titile #"와 같은 형태로도 사용 가능
		예를 들어 "## titile"는 "## titile ##"과 동일
	
#### **example**
># H1 titile
>## H2 titile
>### H3 titile
>#### H4 titile
>##### H5 titile
>###### H6 titile

----------------------------------------------------------------------------------------------------------

### **Emphasis**
>  markdown에서는 기울임, 두껍게, 가로선을 지원
>  중복으로 사용 가능

#### **basic syntax**
	*기울임*
	**두껍게**
	~~가로선~~

#### **expanded syntax**
	
	1) "*기울임*" 대신 "_기울임_"으로 사용 가능

	2) "**두껍게**" 대신 "__두껍게__"으로 사용 가능

	3) 중복으로 적용가능
		"## ** titile ** ##"와 같은 형태로 header와 중복 가능
		"* ** titile ** *"와 같은 형태로 emphasis끼리의 중복 가능

#### **example**
> *기울임*
> **두껍게**
> ~~가로선~~
> ***두꺼운 기울임***

----------------------------------------------------------------------------------------------------------

### **List**
> list는 numbered list와 bulleted list를 사용가능

#### **basic syntax**
	numbered list는 "1. list1"과 같은 형태로 사용
	bulleted list는 "* item"과 같은 형태로 사용

#### **expanded syntax**
	1) numbered list는 자동정렬 되며, 번호는 무조건 1부터 순차적으로 표시
		다음은 모두 동일하게 출력됨
	    ----------------------------------------------------------
		  1) item01
		  2) item02
		  3) item03
	    ----------------------------------------------------------
	    (번호가 바뀌어도)
		  1) item01
		  3) item03
		  2) item02
	    ----------------------------------------------------------
	    (번호가 똑같아도)
		  1) item01
		  1) item02
		  1) item03
		----------------------------------------------------------
		(번호가 순차적이 아니더라도)
		  1) item01
		  4) item02
		  8) item03
		  
	2) bulleted list는 "+", "-"로 대체가능

	3) list in list도 가능하며 문자앞 공백을 통해서 depth를 컨트롤 가능

#### **example**

> ##### **numbered list**
> 1. first item
> 2. second item
> 
> ##### **bulleted list**
> * item01
> 1. depth01
> * item02
>  1. depth01
>   * child of child01
>   * child of child02
>  5. depth01
> * item03

----------------------------------------------------------------------------------------------------------

### **Code blocks**
> code block은 타이핑한 문자 그대로 보여짐

#### **basic syntax**
	[tab]이나 4 spaces 이상을 입력

#### **example**
    ### head 라고 입력해도 그대로 보여지고,
    **bold** 라고 입력해도 그대로 보여진다.
    1) item01 이라고 입력해도 리스트로 보여지지 않는다.

----------------------------------------------------------------------------------------------------------


### **Horizontal rules**
> 수평선을 표시

#### **basic syntax**
	* * *
	***
	******
	- - - - - - - - - - - - 
	------------------------------

#### **example**
> ----------------------

----------------------------------------------------------------------------------------------------------

**Span Elements**
---

### **Link & Email**
> 다른 위치로 link를 걸때 사용
> ***inline link***와 ***reference link***를 지원

#### **basic syntax**
	inline link : [link name](link-address "Title")
	reference link : [link name](/page/ref/path), Title은 option
	email link : <email@address.com>

#### **expanded syntax**
	
	1) inline link에서 
			- "title"은 optional 값
			- 
	2) reference link에서
		- [link name][id]와 같은 형태로 사용 가능
			- id는 문서 어디서라도 [id]: http://anywhere.com/ "Optional title hre"와 같이 표시
			- id는 대소문자 구분 없음 [id]와 [ID]는 동일

#### **example**
>[google](http://google.com)
>[google]()
><email@gmail.com>

----------------------------------------------------------------------------------------------------------

### **Programming lanuage**
> Programming Lanuage를 표시하기 위해 사용

#### **basic syntax**
	``` language name
	<some code>
	```

#### **example**
```java
class Clz{
    private String hello = "hello";
    
    void say(){
        System.out.println("say " + this.hello);
    }
}
```

