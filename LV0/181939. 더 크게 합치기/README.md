<h1>[level 0] 수 조작하기 1</h1>

<a href="https://school.programmers.co.kr/learn/courses/30/lessons/181939#">👉 문제 보러가기</a>

<h2>성능 요약</h2>
<b>시간: 0.02ms, 메모리 : 77MB</b>

<h2>문제 설명</h2>
<b>연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.</b><br>
<ul>
    <li>12 ⊕ 3 = 123</li>
    <li>3 ⊕ 12 = 312</li>
</ul>
<b>양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.</b>
<b>단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.</b>


<hr>

<h3>제한사항</h3>
<ul>
    <li>1 ≤ a, b < 10,000</li>
</ul>

<hr>

<h3>입출력 예</h3>
<table>
    <tr>
        <th>a</th>
        <th>b</th>
        <th>result</th>
    </tr>
    <tr>
        <td>9</td>
        <td>91</td>
        <td>991</td>
    </tr>
    <tr>
        <td>89</td>
        <td>8</td>
        <td>898</td>
    </tr>
</table>

<hr>

<h3>입출력 예시 #1</h3>
<ul>
    <li>a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.</li>
</ul>

<h3>입출력 예시 #2</h3>
<ul>
    <li>a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.</li>
</ul>

<hr>

<a href="https://school.programmers.co.kr/">출처: 프로그래머스 코딩 테스트 연습 </a>