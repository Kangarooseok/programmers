<h1>[level 0] 수 조작하기 1</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181926?language=java">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간: 0.86ms, 메모리 : 79.7MB</b>

<h2>문제 설명</h2>
<b>정수 n과 문자열 control이 주어집니다. control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.</b><br>
<ul>
    <li>"w" : n이 1 커집니다.</li>
    <li>"s" : n이 1 작아집니다.</li>
    <li>"d" : n이 10 커집니다.</li>
    <li>"a" : n이 10 작아집니다.</li>
</ul>
<b>위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.</b>

<hr>

<h3>제한사항</h3>
<ul>
    <li>-100,000 ≤ n ≤ 100,000</li>
    <li>1 ≤ control의 길이 ≤ 100,000</li>
    <ul>
        <li>control은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.</li>
    </ul>

</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>n</th>
        <th>control</th>
        <th>result</th>
    </tr>
    <tr>
        <td>0</td>
        <td>"wsdawsdassw"</td>
        <td>-1</td>
    </tr>
</table>

<hr>

<h3>입출력 예시</h3>
<ul>
    <li>수 n은 control에 따라 다음과 같은 순서로 변하게 됩니다.</li>
    <li>0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1</li>
    <li>따라서 -1을 return 합니다.</li>
</ul>

<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>