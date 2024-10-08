<h1>[코딩 기초 트레이닝] flag에 따라 다른 값 반환하기</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181933">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간: 0.02ms, 메모리 : 73MB</b>

<h2>문제 설명</h2>
<b>두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.</b><br>

<hr>

<h3>제한사항</h3>
<ul>
    <li>-1,000 ≤ a, b ≤ 1,000</li>
</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>a</th>
        <th>b</th> 
        <th>flag</th>
        <th>result</th>
    </tr>
    <tr>
        <td>-4</td>
        <td>7</td>
        <td>true</td>
        <td>3</td>
    </tr>
    <tr>
        <td>-4</td>
        <td>7</td>
        <td>false</td>
        <td>-11</td>
    </tr>

</table>

<hr>

<h3>입출력 예시 #1</h3>
<ul>
    <li>예제 1번에서 flag가 true이므로 a + b = (-4) + 7 = 3을 return 합니다.</li>
</ul>

<h3>입출력 예시 #2</h3>
<ul>
    <li>예제 2번에서 flag가 false이므로 a - b = (-4) - 7 = -11을 return 합니다.</li>
</ul>


<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>